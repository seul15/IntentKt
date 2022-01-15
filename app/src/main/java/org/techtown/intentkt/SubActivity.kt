package org.techtown.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.intentkt.databinding.ActivityMainBinding
import org.techtown.intentkt.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    val binding by lazy { ActivitySubBinding.inflate(layoutInflater) } // 서브 화면 제작할때 Activity_Binding 파트 바꿔줘야함
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if(intent.hasExtra("msg"))
        {
            binding.tvGetMsg.text = intent.getStringExtra("msg") // 서브 액티비티에 존재하는 텍스트뷰에다가 HelloWorld가 넘겨져 옴.
        }
    }
}