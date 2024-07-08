package com.example.googleio2024.gdgbusanlist.organizers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.googleio2024.Organizer
import com.example.googleio2024.databinding.ItemOrganizerBinding

class OrganizersAdapter(
    private val organizers: List<Organizer>,
) : RecyclerView.Adapter<OrganizerViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): OrganizerViewHolder = OrganizerViewHolder.from(parent)

    override fun onBindViewHolder(
        holder: OrganizerViewHolder,
        position: Int,
    ) = holder.bind(organizers[position])

    override fun getItemCount(): Int = organizers.size
}
