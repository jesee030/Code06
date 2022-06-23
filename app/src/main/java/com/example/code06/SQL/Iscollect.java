package com.example.code06.SQL;

import com.google.gson.annotations.SerializedName;

public class Iscollect {
    @SerializedName("data")
    private cdata data;

    public cdata getData() {
        return data;
    }

    public void setData(cdata data) {
        this.data = data;
    }

    public class cdata{
        @SerializedName("hasCollect")
        private String hascollect;
        @SerializedName("collectId")
        private String collect;
        @SerializedName("likeId")
        private String likeId;
        @SerializedName("likeNum")
        private String likenum;

        public void setLikenum(String likenum) {
            this.likenum = likenum;
        }

        public String getLikenum() {
            return likenum;
        }

        public String getLikeId() {
            return likeId;
        }

        public void setLikeId(String likeId) {
            this.likeId = likeId;
        }

        public void setCollect(String collect) {
            this.collect = collect;
        }

        public String getCollect() {
            return collect;
        }

        public void setHascollect(String hascollect) {
            this.hascollect = hascollect;
        }

        public String getHascollect() {
            return hascollect;
        }
    }
}
