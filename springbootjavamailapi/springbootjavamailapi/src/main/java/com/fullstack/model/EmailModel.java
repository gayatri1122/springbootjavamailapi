package com.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {

    private String toMail[];

    private String ccMail[];

    private String emailSubject;

    private String emailBody;

    private String emailAttachment;
}
