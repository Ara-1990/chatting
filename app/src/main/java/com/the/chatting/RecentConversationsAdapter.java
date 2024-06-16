package com.the.chatting;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.the.chatting.databinding.ItemConteinerRecentConversetionBinding;

import java.util.List;

public class RecentConversationsAdapter extends RecyclerView.Adapter<RecentConversationsAdapter.ConversionViewHolder> {

    private final List<ChatMessage> chatMessages;
    private final ConversetionListener conversetionListener;

    public RecentConversationsAdapter(List<ChatMessage> chatMessages, ConversetionListener conversetionListener) {
        this.chatMessages = chatMessages;
        this.conversetionListener = conversetionListener;
    }

    @NonNull
    @Override
    public ConversionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ConversionViewHolder(
                ItemConteinerRecentConversetionBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull RecentConversationsAdapter.ConversionViewHolder holder, int position) {
        holder.setData(chatMessages.get(position));
    }

    @Override
    public int getItemCount() {
        return chatMessages.size();
    }

    class ConversionViewHolder extends RecyclerView.ViewHolder{

        ItemConteinerRecentConversetionBinding binding;

        ConversionViewHolder(ItemConteinerRecentConversetionBinding itemConteinerRecentConversetionBinding) {
            super(itemConteinerRecentConversetionBinding.getRoot());
            binding = itemConteinerRecentConversetionBinding;
        }
        void setData(ChatMessage chatMessage){
            binding.imageProfile.setImageBitmap(getConvershionImage(chatMessage.conversetionImage));
            binding.textName.setText(chatMessage.conversetionName);
            binding.textRecentMeneger.setText(chatMessage.message);
            binding.getRoot().setOnClickListener(v -> {
                User user = new User();
                user.id = chatMessage.conversetionId;
                user.name = chatMessage.conversetionName;
                user.image = chatMessage.conversetionImage;
                conversetionListener.onConversetionClicked(user);
            });
        }
    }
    private Bitmap getConvershionImage(String encodedImage){
        byte[] bytes = Base64.decode(encodedImage, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes,0, bytes.length);
    }
}

