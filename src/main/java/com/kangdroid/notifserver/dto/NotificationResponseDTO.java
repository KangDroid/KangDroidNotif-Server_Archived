package com.kangdroid.notifserver.dto;

import com.kangdroid.notifserver.domain.Notification;
import lombok.Getter;

@Getter
public class NotificationResponseDTO {
    private final String reqPackage;
    private final String title;
    private final String content;
    private final String genDate;
    private Long id;

    public NotificationResponseDTO(Notification notification) {
        this.id = notification.getId();
        this.reqPackage = notification.getReqPackage();
        this.title = notification.getTitle();
        this.content = notification.getContent();
        this.genDate = notification.getGenDate();
    }

    public NotificationResponseDTO(String reqPackage,String title, String content, String genDate) {
        this.reqPackage = reqPackage;
        this.title = title;
        this.content = content;
        this.genDate = genDate;
    }
}
