package com.capstone.tansiri;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.skt.tmap.TMapView; // TMapView를 사용하기 위해 import 추가

public class WalkingRoute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walking_route); // XML 파일 설정

        // TMapView를 추가할 LinearLayout 참조
        LinearLayout linearLayoutTmap = (LinearLayout) findViewById(R.id.linearLayoutTmap);

        // TMapView 생성
        TMapView tMapView = new TMapView(this);

        // 발급받은 API 키 설정
        tMapView.setSKTMapApiKey("EHDhTt6iqk7HwqS2AirSY71g65xVG8Rp3LtZaIIx");

        // TMapView를 LinearLayout에 추가
        linearLayoutTmap.addView(tMapView);

        // TMapView의 크기 설정 (예: MATCH_PARENT)
        tMapView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
    }
}
