package com.swipy.model.dto;

import java.util.Date;
import java.util.UUID;

public class ReserveDto {
    private UUID id;
    private Date startDate;
    private Date endDate;
    private UUID productId;
    private UUID userId;
    private String status;
    private String paymentStatus;
}
