package cn.rongcloud.chatroomdemo.messageview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import cn.rongcloud.chatroomdemo.R;
import io.rong.imlib.model.MessageContent;
import io.rong.message.ChatroomStart;

/**
 * Created by duanliuyi on 2018/6/20.
 */

public class StartMsgView extends BaseMsgView {

    private TextView tvInfo;

    public StartMsgView(Context context) {
        super(context);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.msg_system_view, this);
        tvInfo = (TextView) view.findViewById(R.id.tv_info);
    }

    @Override
    public void setContent(MessageContent msgContent, String senderUserId) {
        if (msgContent instanceof ChatroomStart) {
            String time = ((ChatroomStart) msgContent).getTime();
            tvInfo.setText("系统消息  " + time + "  开始直播");
        }

    }
}
