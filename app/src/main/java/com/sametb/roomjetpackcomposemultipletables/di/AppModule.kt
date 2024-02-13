package com.sametb.roomjetpackcomposemultipletables.di

import android.content.Context
import androidx.room.Room
import com.sametb.roomjetpackcomposemultipletables.TeamDao
import com.sametb.roomjetpackcomposemultipletables.TeamDatabase
import com.sametb.roomjetpackcomposemultipletables.repo.TeamRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables
* Created by SAMET BAYAT 
* on 13.02.2024 at 12:23 AM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Singleton
    @Provides
    fun provideRoomDatabase(
        @ApplicationContext appContext: Context
    ): TeamDatabase
    = Room.databaseBuilder(
        appContext,
        TeamDatabase::class.java,
        "team_db"
    )
        .fallbackToDestructiveMigration()
        .addMigrations()
        .build()


    @Provides
    @Singleton
    fun provideDao(teamDatabase: TeamDatabase): TeamDao
    = teamDatabase.teamDao()

    @Provides
    @Singleton
    fun provideTeamRepository(teamDao: TeamDao): TeamRepository
    = TeamRepository(teamDao = teamDao)

}