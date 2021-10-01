package com.umesh.plantix.albumlist.persentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.umesh.plantix.R
import com.umesh.plantix.databinding.ListItemBinding
import com.umesh.plantix.albumlist.data.model.Row
import com.umesh.plantix.setImageByGlide

class ImageAdapter(var list: List<Row/*PickSumApiResponseItem*/>, val onClickPost: OnClickPost) :
    RecyclerView.Adapter<ImageAdapter.ImageListViewHolder>() {
    lateinit var binding: ListItemBinding


    inner class ImageListViewHolder() : RecyclerView.ViewHolder(binding.root) {
        fun bind(article: Row/*PickSumApiResponseItem*/) {
            binding.tvPhotoAlbumName.text = article.title
            binding.tvPhotoAlbumDiscription.text = article.description

            setImageByGlide(binding.root.context,article.imageHref?:"",binding.ivPhotoAlbum)
            binding.root.setOnClickListener {
                onClickPost.openImageListPost(article,layoutPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageListViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.list_item,
            parent,
            false
        )
        return ImageListViewHolder()
    }

    override fun onBindViewHolder(holder: ImageListViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    interface OnClickPost {
        fun openImageListPost(article: Row, position: Int)
    }
    }