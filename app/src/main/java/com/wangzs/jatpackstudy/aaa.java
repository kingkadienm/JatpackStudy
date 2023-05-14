package com.wangzs.jatpackstudy;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aaa {



    private <T extends View> void  getList(int index ,
                                                  List<T> contentView, Map<TextView, ImageView>... t){


    }

    private void aa(){
        aaa aaa = new aaa();
        List<ImageView> list= new ArrayList<>();
        HashMap<TextView, ImageView> textViewImageViewHashMap = new HashMap<>();
        aaa.getList(1,list,textViewImageViewHashMap,textViewImageViewHashMap,textViewImageViewHashMap);
    }
    
}
