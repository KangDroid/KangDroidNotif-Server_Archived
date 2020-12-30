package com.kangdroid.notifserver.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // Implement getter automatically
@NoArgsConstructor // Without automatic argument constructor
@Entity // This is Entity!
public class Notification {

    // Identifier
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Notification Name[Title]
    @Column(length = 500, nullable = false)
    private String title;

    // Notification Content
    @Column(nullable = false)
    private String content;

    // Notification Date[When generated?]
    @Column(nullable = false)
    private String genDate;

    // Constructor[With lombok - builder]
    @Builder
    public Notification(String title, String content, String genDate) {
        this.title = title;
        this.content = content;
        this.genDate = genDate;
    }
}