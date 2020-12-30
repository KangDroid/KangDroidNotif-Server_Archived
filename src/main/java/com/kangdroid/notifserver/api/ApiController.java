package com.kangdroid.notifserver.api;

import com.kangdroid.notifserver.domain.Notification;
import com.kangdroid.notifserver.dto.NotificationDTO;
import com.kangdroid.notifserver.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ApiController {
    @GetMapping("/get/NotifCount")
    public String getNotifCount() {
        return "10";
    }
}
