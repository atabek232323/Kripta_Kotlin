package com.example.kripta_kotlin.recyclerView

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.core.content.res.ResourcesCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import com.example.kripta_kotlin.R
import com.example.kripta_kotlin.databinding.ListKriptaBinding
import com.example.kripta_kotlin.model.Kripto
import android.graphics.drawable.ColorDrawable
import androidx.annotation.ColorRes


class KriptaAdapter(val context: Context) : RecyclerView.Adapter<KriptaAdapter.MyVievHolder>() {
private lateinit var binding : ListKriptaBinding
var list : List<Kripto> = emptyList()


    class MyVievHolder(private val binding: ListKriptaBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(kripta : Kripto, context: Context) {
            binding.tvExchange.text = kripta.exchange
            binding.tvExchange.setBackgroundResource(R.color.teal_200);
            binding.tvExx.text = kripta.exx
            binding.tvExx.setBackgroundResource(R.color.teal_700)
            binding.tvMarket.text = kripta.market
            binding.tvMarket.setBackgroundResource(R.color.jj)
            binding.tvCANUSDT.text = kripta.CAN_USDT
            binding.tvCANUSDT.setBackgroundResource(R.color.jjj)
            binding.tvBase.text = kripta.base
            binding.tvBase.setBackgroundResource(R.color.jjjj)
            binding.tvQuote.text = kripta.quote
            binding.tvQuote.setBackgroundResource(R.color.jjjjj)
        }
    }

    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : MyVievHolder {
      binding = ListKriptaBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return MyVievHolder(binding)
    }

    override fun onBindViewHolder(holder : MyVievHolder, position : Int) {
        holder.bind(list[position],context)

    }

    override fun getItemCount() : Int {
        return list.size
    }
    fun setData(list: List<Kripto>) {
        this.list = list
        notifyDataSetChanged()
    }
}