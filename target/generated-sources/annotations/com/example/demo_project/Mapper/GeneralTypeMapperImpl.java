package com.example.demo_project.Mapper;

import com.example.demo_project.DTOs.GeneralStatus;
import com.example.demo_project.DTOs.GeneralType;
import com.example.demo_project.Entity.GnlStEntity;
import com.example.demo_project.Entity.GnlTpEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-09T23:11:40+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class GeneralTypeMapperImpl implements GeneralTypeMapper {

    @Override
    public GeneralType toGeneralType(GnlTpEntity gnlTpEntity) {
        if ( gnlTpEntity == null ) {
            return null;
        }

        GeneralType generalType = new GeneralType();

        generalType.setGeneralTypeId( gnlTpEntity.getGnlTpId() );
        generalType.setName( gnlTpEntity.getName() );
        generalType.setDescription( gnlTpEntity.getDescr() );
        generalType.setShortCode( gnlTpEntity.getShrtCode() );
        generalType.setEntityCodeName( gnlTpEntity.getEndCodeName() );
        if ( gnlTpEntity.getIsActv() != null ) {
            generalType.setActive( Boolean.parseBoolean( gnlTpEntity.getIsActv() ) );
        }

        return generalType;
    }

    @Override
    public GnlStEntity toGnlStEntity(GeneralStatus generalStatus) {
        if ( generalStatus == null ) {
            return null;
        }

        GnlStEntity gnlStEntity = new GnlStEntity();

        gnlStEntity.setName( generalStatus.getName() );

        return gnlStEntity;
    }
}
