package sala.xevi.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import sala.xevi.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainActivityViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)


        setContentView(binding.root)
        //Every time that viewModel.textField changes, binding.textView will be changed.
        viewModel.textField.observe(this, Observer {newTextField ->
            binding.textView.setText(newTextField)
        })

        binding.button.setOnClickListener {
            binding.textView.setText(
                binding.editTextTextPersonName.text.toString())
            //Every time the value is changed, is saved on viewModel
            viewModel.changeTheTextField(binding.editTextTextPersonName.text.toString())
            //viewModel.textField.value = binding.editTextTextPersonName.text.toString()
        }

        //When the activity or fragment is created, the data can be restored from viewModel
        binding.textView.setText(viewModel.textField.value)

    }




}