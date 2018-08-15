package com.hand.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author bce1100
 * @date 2018/8/15.
 */
public class MailEvent1 extends ApplicationEvent {
    private String recipients;
    private String subject;
    private String content;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MailEvent1(Object source, String recipients, String subject, String content) {
        super(source);
        this.recipients = recipients;
        this.subject = subject;
        this.content = content;
    }

    public String getRecipients() {
        return recipients;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public void getMail() {
        System.out.println("收件人:\t" + recipients);
        System.out.println("收到主题为:\t" + subject);
        System.out.println("正文内容为: \t" + content);
    }
}
