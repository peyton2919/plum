package cn.peyton.plum.core.mail;


import cn.peyton.plum.core.commons.ApplicationContextHelper;
import cn.peyton.plum.core.exception.child.GlobalException;
import cn.peyton.plum.core.mail.beans.Mail;
import cn.peyton.plum.core.mail.util.MailEncryptUtil;
import cn.peyton.plum.core.mail.util.MailUtil;
import cn.peyton.plum.core.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.io.Serializable;

/**
 * <h3><h3>Mail 支持类 [对外调用方法]</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @create date: 2018/11/16 15:41
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Slf4j
public final class MailHolder implements Serializable {

    private static MailHolder instance;
    private static MailListener mailListener;
    private static String receiver;
    private static String password;

    private MailHolder(){
        mailListener = ApplicationContextHelper.popBean(MailListener.class);
        if (null == mailListener){
            throw new GlobalException("没有在spring配置文件中配置MailListener 参数" +
                    " [要配置发送邮件,需要在spring配置文件中,配置MailListener]");
        }
    }

    /**
     * <h4>单例模式</h4>
     * @param receiver 接收者地址
     * @param password 密码
     * @return
     */
    public static synchronized MailHolder getInstance(String receiver , String password) {
        if (null == instance){
            instance = new MailHolder();
            MailHolder.receiver = receiver;
            MailHolder.password = password;
        }
        return instance;
    }

    /**
     * <h4>发送邮件</h4>
     * @return
     */
    public boolean send() {

        Mail mail = MailUtil.getMail(receiver, password);
        HtmlEmail email = new HtmlEmail();
        try {
            email.setHostName(mailListener.getHost());
            email.setCharset("UTF-8");
            for (String str : mail.getReceivers()) {
                email.addTo(str);
            }
            email.setFrom(mailListener.getFrom(),mailListener.getNickname());
            email.setSmtpPort(mailListener.getPort());
            email.setAuthentication(mailListener.getFrom(),mailListener.getPassword());
            email.setSubject(mail.getSubject());
            email.setMsg(mail.getMessage());
            email.send();
            log.info("{} 发送邮件到 {}", mailListener.getFrom(), StringUtil.join(mail.getReceivers(), ","));
            return true;
        } catch (EmailException e) {
            log.error(mailListener.getFrom() + "发送邮件到" + StringUtil.join(mail.getReceivers(), ",") + "失败。");

            return false;
        }
    }

    /**
     * <h4>解密</h4>
     * @param encryptContent 要解密内容
     * @return 解密后内容
     */
    public String decoder(String encryptContent) {
        return MailEncryptUtil.decoder(encryptContent);
    }

    /**
     * <h4>加密</h4>
     * @param content 内容
     * @return 加密后内容
     */
    public String encoder(String content) {
        return MailEncryptUtil.encoder(content);
    }

}

