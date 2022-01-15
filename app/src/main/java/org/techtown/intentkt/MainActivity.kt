package org.techtown.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import org.techtown.intentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnA.setOnClickListener{
            //var : 값이 언제든지 변경할 수 있는 변수
            //val : 값이 변경되지 못하는 변수
            val intent = Intent(this,SubActivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성
            intent.putExtra("msg",binding.tvSendMsg.text.toString()) // HelloWorld 라는 텍스트 값을 담은 뒤 msg라는 키로 잠궜다.
            startActivity(intent) // intent에 저장되어있는 액티비티 쪽으로 이동한다
            finish() //자기 자신 액티비티를 파괴한다.
        }

        binding.btnB.setOnClickListener{
            var st = binding.tvWrite.text.toString()
            binding.tvSendMsg.setText(st)
        }
    }
}