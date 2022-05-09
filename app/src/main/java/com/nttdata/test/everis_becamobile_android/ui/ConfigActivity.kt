package com.nttdata.test.everis_becamobile_android.ui

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.nttdata.test.everis_becamobile_android.R
import com.nttdata.test.everis_becamobile_android.databinding.ActivityConfigBinding
import com.nttdata.test.everis_becamobile_android.utils.Constants

class ConfigActivity : AppCompatActivity(), AdapterView.OnItemClickListener,
    AdapterView.OnItemSelectedListener {
    private val binding by lazy { ActivityConfigBinding.inflate(layoutInflater) }
    lateinit var languages:Array<String>
    var langId:Long? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        languages = resources.getStringArray(R.array.languages)

        getData()

        loadSpinner()

        binding.spinner.onItemSelectedListener = this

    }

    private fun getData() {
        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        val defaultValue = languages[0]
        val languageSelected = sharedPref.getString(Constants.languageSelected, defaultValue)
    }

    private fun loadSpinner() {

        ArrayAdapter.createFromResource(
            this,
            R.array.languages,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner.adapter = adapter
        }

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, pos: Int, id: Long) {
        //Toast.makeText(this, "Language selected: ${languages[pos]}", Toast.LENGTH_SHORT).show()
        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putInt(Constants.language, pos)
            putString(Constants.languageSelected, languages[pos])
            putLong(Constants.languageId,id)
            apply()
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, pos: Int, id: Long) {
        Toast.makeText(this, "Language selected: ${languages[pos]}", Toast.LENGTH_SHORT).show()
    }
}
