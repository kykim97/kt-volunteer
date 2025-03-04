
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import VolunteerVolunteerInfoManager from "./components/listers/VolunteerVolunteerInfoCards"
import VolunteerVolunteerInfoDetail from "./components/listers/VolunteerVolunteerInfoDetail"

import MatchingMatchingInfoManager from "./components/listers/MatchingMatchingInfoCards"
import MatchingMatchingInfoDetail from "./components/listers/MatchingMatchingInfoDetail"
import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import VolunteeringVolunteeringManager from "./components/listers/VolunteeringVolunteeringCards"
import VolunteeringVolunteeringDetail from "./components/listers/VolunteeringVolunteeringDetail"

import CheckApplicationHistoryView from "./components/CheckApplicationHistoryView"
import CheckApplicationHistoryViewDetail from "./components/CheckApplicationHistoryViewDetail"
import AssociationAssociationInfoManager from "./components/listers/AssociationAssociationInfoCards"
import AssociationAssociationInfoDetail from "./components/listers/AssociationAssociationInfoDetail"

import CheckScheduleView from "./components/CheckScheduleView"
import CheckScheduleViewDetail from "./components/CheckScheduleViewDetail"

import VolunteerhistoryView from "./components/VolunteerhistoryView"
import VolunteerhistoryViewDetail from "./components/VolunteerhistoryViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/volunteers/volunteerInfos',
                name: 'VolunteerVolunteerInfoManager',
                component: VolunteerVolunteerInfoManager
            },
            {
                path: '/volunteers/volunteerInfos/:id',
                name: 'VolunteerVolunteerInfoDetail',
                component: VolunteerVolunteerInfoDetail
            },

            {
                path: '/matchings/matchingInfos',
                name: 'MatchingMatchingInfoManager',
                component: MatchingMatchingInfoManager
            },
            {
                path: '/matchings/matchingInfos/:id',
                name: 'MatchingMatchingInfoDetail',
                component: MatchingMatchingInfoDetail
            },
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/volunteerings/volunteerings',
                name: 'VolunteeringVolunteeringManager',
                component: VolunteeringVolunteeringManager
            },
            {
                path: '/volunteerings/volunteerings/:id',
                name: 'VolunteeringVolunteeringDetail',
                component: VolunteeringVolunteeringDetail
            },

            {
                path: '/volunteerings/checkApplicationHistories',
                name: 'CheckApplicationHistoryView',
                component: CheckApplicationHistoryView
            },
            {
                path: '/volunteerings/checkApplicationHistories/:id',
                name: 'CheckApplicationHistoryViewDetail',
                component: CheckApplicationHistoryViewDetail
            },
            {
                path: '/associations/associationInfos',
                name: 'AssociationAssociationInfoManager',
                component: AssociationAssociationInfoManager
            },
            {
                path: '/associations/associationInfos/:id',
                name: 'AssociationAssociationInfoDetail',
                component: AssociationAssociationInfoDetail
            },

            {
                path: '/associations/checkSchedules',
                name: 'CheckScheduleView',
                component: CheckScheduleView
            },
            {
                path: '/associations/checkSchedules/:id',
                name: 'CheckScheduleViewDetail',
                component: CheckScheduleViewDetail
            },

            {
                path: '/mypages/volunteerhistories',
                name: 'VolunteerhistoryView',
                component: VolunteerhistoryView
            },
            {
                path: '/mypages/volunteerhistories/:id',
                name: 'VolunteerhistoryViewDetail',
                component: VolunteerhistoryViewDetail
            },


    ]
})
