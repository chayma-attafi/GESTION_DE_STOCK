package com.esprit.GestionDeStock.DTOs;


import com.esprit.GestionDeStock.Entites.MvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private String TypeMvt;

    public static MvtStkDto fromEntity(MvtStk mvtStk){
        if(mvtStk == null){
            return null;
        }

        return MvtStkDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDatemvt())
                .quantite(mvtStk.getQuantite())
                .build();
    }

    public static MvtStk toEntity(MvtStkDto mvtStkDto){
        if(mvtStkDto == null){
            return null;
        }

        MvtStk mvtStk = new MvtStk();
        mvtStk.setId((mvtStkDto.getId()));
        mvtStk.setDatemvt(mvtStkDto.getDateMvt());
        mvtStk.setQuantite((mvtStkDto.getQuantite()));
        return mvtStk;
    }
}
