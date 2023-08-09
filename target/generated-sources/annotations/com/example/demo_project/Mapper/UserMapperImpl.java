package com.example.demo_project.Mapper;

import com.example.demo_project.DTOs.GeneralType;
import com.example.demo_project.DTOs.User;
import com.example.demo_project.Entity.GnlStEntity;
import com.example.demo_project.Entity.GnlTpEntity;
import com.example.demo_project.Entity.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-09T23:11:40+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    private final GeneralTypeMapper generalTypeMapper = GeneralTypeMapper.INSTANCE;

    @Override
    public User toUser(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( userEntity.getUserId() );
        user.setScreenName( userEntity.getScrName() );
        user.setUserName( userEntity.getUname() );
        user.setPassword( userEntity.getPwd() );
        user.setUserType( generalTypeMapper.toGeneralType( userEntity.getUserTpId() ) );
        user.setStatusId( userEntityGnlStIdGnlStId( userEntity ) );

        return user;
    }

    @Override
    public UserEntity toUserEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setGnlStId( userToGnlStEntity( user ) );
        userEntity.setUserId( user.getUserId() );
        userEntity.setScrName( user.getScreenName() );
        userEntity.setUname( user.getUserName() );
        userEntity.setPwd( user.getPassword() );
        userEntity.setUserTpId( generalTypeToGnlTpEntity( user.getUserType() ) );

        return userEntity;
    }

    private Long userEntityGnlStIdGnlStId(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }
        GnlStEntity gnlStId = userEntity.getGnlStId();
        if ( gnlStId == null ) {
            return null;
        }
        Long gnlStId1 = gnlStId.getGnlStId();
        if ( gnlStId1 == null ) {
            return null;
        }
        return gnlStId1;
    }

    protected GnlStEntity userToGnlStEntity(User user) {
        if ( user == null ) {
            return null;
        }

        GnlStEntity gnlStEntity = new GnlStEntity();

        gnlStEntity.setGnlStId( user.getStatusId() );

        return gnlStEntity;
    }

    protected GnlTpEntity generalTypeToGnlTpEntity(GeneralType generalType) {
        if ( generalType == null ) {
            return null;
        }

        GnlTpEntity gnlTpEntity = new GnlTpEntity();

        gnlTpEntity.setName( generalType.getName() );

        return gnlTpEntity;
    }
}
