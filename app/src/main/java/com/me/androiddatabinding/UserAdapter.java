package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.me.androiddatabinding.databinding.UserItemBinding;
import com.me.androiddatabinding.model.User;
import com.me.androiddatabinding.util.Randoms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao.liu on 2017/7/28.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

        private List<User> users;

        public UserAdapter() {
                users = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                        User user = new User(Randoms.nextFirstName(), Randoms.nextLastName());
                        users.add(user);
                }
                Log.d("UserAdapter", "users:" + users.size());
        }

        @Override
        public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
                return new UserHolder(view);
        }

        @Override
        public void onBindViewHolder(UserHolder holder, int position) {
                holder.bind(users.get(position));
        }

        @Override
        public int getItemCount() {
                return users.size();
        }

        public static class UserHolder extends RecyclerView.ViewHolder {

                private final UserItemBinding binding;

                public UserHolder(View itemView) {
                        super(itemView);
                        binding = DataBindingUtil.bind(itemView);
                }

                public void bind(User user) {
                        binding.setUser(user);
                }

        }
}
