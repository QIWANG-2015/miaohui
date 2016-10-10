package com.dingzhi.miaohui.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dingzhi.miaohui.BaseActivity;
import com.dingzhi.miaohui.R;
import com.dingzhi.miaohui.ui.fragment.MyFragment;
import com.dingzhi.miaohui.util.glideutil.GlideUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

 /**
   * explain 订单详情界面
   * created by TanXin.
   * created date 2016/9/21 15:34.
   */
public class OrderDetailActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.img_head)
    ImageView imgHead;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_context)
    TextView tvContext;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.tv_hourly)
    TextView tvHourly;
    @BindView(R.id.tv_fee)
    TextView tvFee;
    @BindView(R.id.btn_chat)
    Button btnChat;
    @BindView(R.id.btn_weixin)
    Button btnWeixin;
    @BindView(R.id.tv_ordernum)
    TextView tvOrdernum;
    @BindView(R.id.tv_ordertime)
    TextView tvOrdertime;

    @Override
    protected int setLayout() {
        return R.layout.activity_order_detail;
    }

    @Override
    protected void initView() {
        toolbar.setTitle("订单详情");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        GlideUtils.getInstance().loadRoundImageView(this, MyFragment.MOCK_DATA_URL, imgHead);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    @OnClick(R.id.btn_chat)
    public void onClick() {
    }
}
