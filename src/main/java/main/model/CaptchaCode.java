package main.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "captcha_codes")
public class CaptchaCode {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String code;
    @Column(name = "secret_code", nullable = false)
    private String secretCode;
    @NotNull
    private LocalDateTime time;

    public CaptchaCode() {
    }
}