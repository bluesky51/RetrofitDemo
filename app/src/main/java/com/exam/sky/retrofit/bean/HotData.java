package com.exam.sky.retrofit.bean;

import java.util.List;

/**
 * Created by bluesky on 16/10/18.
 */

public class HotData {

    /**
     * msg : OK
     * data : [{"repost_num":65,"free_ship":1,"title":"迷你直发卷发两用烫发器","price":26,"published_at":1461584812,"url":"http://www.menghuoapp.com/item/36959","pic_url":"http://gd1.alicdn.com/bao/uploaded/i1/2816618896/TB2_31fnFXXXXahXXXXXXXXXXXX_!!2816618896.jpg","favorite":0,"item_id":36959,"favorite_num":134},{"repost_num":156,"free_ship":0,"title":"果酱中筒男女防雨鞋","price":18.5,"published_at":1461585665,"url":"http://www.menghuoapp.com/item/36965","pic_url":"http://gd2.alicdn.com/bao/uploaded/i2/TB1rJ3pLVXXXXXCXVXXXXXXXXXX_!!0-item_pic.jpg","favorite":0,"item_id":36965,"favorite_num":134},{"repost_num":46,"free_ship":1,"title":"你好系列可爱动物三折晴雨伞","price":40,"published_at":1461584670,"url":"http://www.menghuoapp.com/item/36958","pic_url":"http://gd4.alicdn.com/bao/uploaded/i4/2816618896/TB2K6X1nXXXXXaTXpXXXXXXXXXX_!!2816618896.jpg","favorite":0,"item_id":36958,"favorite_num":77},{"repost_num":183,"free_ship":0,"title":"长草颜文字颜表情零钱包","price":9.8,"published_at":1461585259,"url":"http://www.menghuoapp.com/item/36963","pic_url":"http://gd1.alicdn.com/bao/uploaded/i1/2816618896/TB2b4bumFXXXXXAXpXXXXXXXXXX_!!2816618896.jpg","favorite":0,"item_id":36963,"favorite_num":72},{"repost_num":37,"free_ship":1,"title":"龙猫大肚不锈钢真空保温杯","price":19.8,"published_at":1461585046,"url":"http://www.menghuoapp.com/item/36961","pic_url":"http://gd3.alicdn.com/bao/uploaded/i3/2816618896/TB2NsYrnXXXXXa4XpXXXXXXXXXX_!!2816618896.jpg","favorite":0,"item_id":36961,"favorite_num":36},{"repost_num":82,"free_ship":1,"title":"hello Kitty玻璃便携柠檬杯","price":34.5,"published_at":1461585508,"url":"http://www.menghuoapp.com/item/36964","pic_url":"http://gd1.alicdn.com/bao/uploaded/i1/2816618896/TB27MLjnFXXXXXtXpXXXXXXXXXX_!!2816618896.jpg","favorite":0,"item_id":36964,"favorite_num":39},{"repost_num":25,"free_ship":1,"title":"Hello Kitty透明便携玻璃杯水杯","price":28.8,"published_at":1461584928,"url":"http://www.menghuoapp.com/item/36960","pic_url":"http://gd1.alicdn.com/bao/uploaded/i1/2816618896/TB29MfEnFXXXXXVXXXXXXXXXXXX_!!2816618896.jpg","favorite":0,"item_id":36960,"favorite_num":30},{"repost_num":133,"free_ship":1,"title":"可爱龙猫陶瓷马克对杯","price":18,"published_at":1461584478,"url":"http://www.menghuoapp.com/item/36957","pic_url":"http://gd4.alicdn.com/imgextra/i4/2816618896/TB2ygy5mFXXXXbXXpXXXXXXXXXX_!!2816618896.jpg","favorite":0,"item_id":36957,"favorite_num":38},{"repost_num":26,"free_ship":1,"title":"hello kitty咖啡杯带盖勺","price":36,"published_at":1461585107,"url":"http://www.menghuoapp.com/item/36962","pic_url":"http://gd2.alicdn.com/bao/uploaded/i2/2816618896/TB2iDPtmVXXXXcaXFXXXXXXXXXX_!!2816618896.jpg","favorite":0,"item_id":36962,"favorite_num":17},{"repost_num":102,"free_ship":1,"title":"韩国颜文字君硅胶透明笔袋","price":22,"published_at":1457132403,"url":"http://www.menghuoapp.com/item/36955","pic_url":"http://gd4.alicdn.com/bao/uploaded/i4/TB1MeyILXXXXXXaaXXXXXXXXXXX_!!0-item_pic.jpg","favorite":0,"item_id":36955,"favorite_num":113}]
     * code : 0
     */

    private String msg;
    private int code;
    /**
     * repost_num : 65
     * free_ship : 1
     * title : 迷你直发卷发两用烫发器
     * price : 26.0
     * published_at : 1461584812
     * url : http://www.menghuoapp.com/item/36959
     * pic_url : http://gd1.alicdn.com/bao/uploaded/i1/2816618896/TB2_31fnFXXXXahXXXXXXXXXXXX_!!2816618896.jpg
     * favorite : 0
     * item_id : 36959
     * favorite_num : 134
     */

    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int repost_num;
        private int free_ship;
        private String title;
        private double price;
        private int published_at;
        private String url;
        private String pic_url;
        private int favorite;
        private int item_id;
        private int favorite_num;

        public int getRepost_num() {
            return repost_num;
        }

        public void setRepost_num(int repost_num) {
            this.repost_num = repost_num;
        }

        public int getFree_ship() {
            return free_ship;
        }

        public void setFree_ship(int free_ship) {
            this.free_ship = free_ship;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getPublished_at() {
            return published_at;
        }

        public void setPublished_at(int published_at) {
            this.published_at = published_at;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public int getFavorite() {
            return favorite;
        }

        public void setFavorite(int favorite) {
            this.favorite = favorite;
        }

        public int getItem_id() {
            return item_id;
        }

        public void setItem_id(int item_id) {
            this.item_id = item_id;
        }

        public int getFavorite_num() {
            return favorite_num;
        }

        public void setFavorite_num(int favorite_num) {
            this.favorite_num = favorite_num;
        }
    }
}
