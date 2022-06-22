package com.example.code06.SQL;

import com.google.gson.annotations.SerializedName;

public class IsLike {
    public like_data getData() {
        return data;
    }

    public void setData(like_data data) {
        this.data = data;
    }

    @SerializedName("data")
    private like_data data;

    public class like_data{
        @SerializedName("hasLike")
        private String hasLike;

        public String getHasLike() {
            return hasLike;
        }

        public void setHasLike(String hasLike) {
            this.hasLike = hasLike;
        }

        public String getLike_id() {
            return like_id;
        }

        public void setLike_id(String like_id) {
            this.like_id = like_id;
        }

        @SerializedName("likeId")
        private String like_id;
    }
}
