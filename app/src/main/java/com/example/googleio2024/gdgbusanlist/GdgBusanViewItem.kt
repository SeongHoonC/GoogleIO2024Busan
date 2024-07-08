package com.example.googleio2024.gdgbusanlist

import com.example.googleio2024.Event
import com.example.googleio2024.Organizer

sealed interface GdgBusanViewItem {
    data class NowHereEventItem(val event: Event) : GdgBusanViewItem
    data class OrganizersItem(val organizers: List<Organizer>): GdgBusanViewItem
    object PastEventsTitleItem : GdgBusanViewItem
    data class PastEventsItem(val event: Event): GdgBusanViewItem

    companion object {
        const val NOW_HERE_EVENT_ITEM = 0
        const val ORGANIZERS_ITEM = 1
        const val PAST_EVENTS_TITLE_ITEM = 2
        const val PAST_EVENTS_ITEM = 3
    }
}
