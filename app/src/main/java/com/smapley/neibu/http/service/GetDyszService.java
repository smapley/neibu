package com.smapley.neibu.http.service;


import com.smapley.neibu.http.callback.SimpleCallback;
import com.smapley.neibu.http.params.GetDyszParams;

import org.xutils.common.util.LogUtil;
import org.xutils.x;

/**
 * Created by smapley on 15/12/18.
 */
public abstract class GetDyszService {

    public void load(GetDyszParams params) {

        x.http().post(params, new SimpleCallback() {
            @Override
            public void Success(final String data) {
                LogUtil.d(data);
                Succ(data);
            }
        });
    }


    public abstract void Succ(String data);
}