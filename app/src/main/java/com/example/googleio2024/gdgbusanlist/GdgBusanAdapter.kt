package com.example.googleio2024.gdgbusanlist

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleio2024.gdgbusanlist.organizers.OrganizersViewHolder
import com.example.googleio2024.gdgbusanlist.pastevents.PastEventViewHolder
import com.example.googleio2024.gdgbusanlist.pastevents.PastEventsTitleViewHolder

class GdgBusanAdapter(
    private val items: List<GdgBusanViewItem>,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerView.ViewHolder =
        when (viewType) {
            GdgBusanViewItem.NOW_HERE_EVENT_ITEM -> NowHereViewHolder.from(parent)
            GdgBusanViewItem.ORGANIZERS_ITEM -> OrganizersViewHolder.from(parent)
            GdgBusanViewItem.PAST_EVENTS_TITLE_ITEM -> PastEventsTitleViewHolder.from(parent)
            GdgBusanViewItem.PAST_EVENTS_ITEM -> PastEventViewHolder.from(parent)
            else -> throw IllegalArgumentException("Unknown view type: $viewType")
        }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
    ) {
        when (val item = items[position]) {
            is GdgBusanViewItem.NowHereEventItem -> (holder as NowHereViewHolder).bind(item.event)
            is GdgBusanViewItem.OrganizersItem -> (holder as OrganizersViewHolder).bind(item.organizers)
            is GdgBusanViewItem.PastEventsTitleItem -> Unit
            is GdgBusanViewItem.PastEventsItem -> (holder as PastEventViewHolder).bind(item.event)
        }
    }

    override fun getItemViewType(position: Int): Int =
        when (items[position]) {
            is GdgBusanViewItem.NowHereEventItem -> GdgBusanViewItem.NOW_HERE_EVENT_ITEM
            is GdgBusanViewItem.OrganizersItem -> GdgBusanViewItem.ORGANIZERS_ITEM
            is GdgBusanViewItem.PastEventsTitleItem -> GdgBusanViewItem.PAST_EVENTS_TITLE_ITEM
            is GdgBusanViewItem.PastEventsItem -> GdgBusanViewItem.PAST_EVENTS_ITEM
        }
}
