import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import path from 'path';
import { HomeComponent } from './pages/home/home.component';
import { HistoryComponent } from './pages/history/history.component';
import { LiveComponent } from './pages/live/live.component';
import { PointTableComponent } from './pages/point-table/point-table.component';

export const routes: Routes = 
[
    {
        path:"",
        redirectTo:"/live",
        pathMatch:"full"
    },
    {
    path:"home",
    redirectTo:"/live",
   // component:HomeComponent,
    title:"Home | CrickInformer"
   },
   {
    path:"history",
    component:HistoryComponent,
    title:"History | CrickInformer"
   },
   {
    path:"live",
    component:LiveComponent,
    title:"Live Matches | CrickInformer"
   },
   {
    path:"point-table",
    component:PointTableComponent,
    title:"Point-Table | CrickInformer"
   }
];
