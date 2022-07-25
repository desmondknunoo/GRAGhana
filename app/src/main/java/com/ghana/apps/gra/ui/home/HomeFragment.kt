package com.ghana.apps.gra.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.ghana.apps.gra.R

class HomeFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)


        val imageList = ArrayList<SlideModel>()

        //imageList.add(SlideModel("String Url" or R.drawable)
        //imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title
        //imageList.add(SlideModel("String Url" or R.drawable, "title", true) Also you can add centerCrop scaleType for this image
        //imageList.add(SlideModel("https://1.bp.blogspot.com/-GUZsgr8my50/XJUWOhyHyaI/AAAAAAAABUo/bljp3LCS3SUtj-judzlntiETt7G294WcgCLcBGAs/s1600/fox.jpg", "Foxes live wild in the city.", true))
        //imageList.add(SlideModel("https://2.bp.blogspot.com/-CyLH9NnPoAo/XJUWK2UHiMI/AAAAAAAABUk/D8XMUIGhDbwEhC29dQb-7gfYb16GysaQgCLcBGAs/s1600/tiger.jpg"))
        //imageList.add(SlideModel("https://3.bp.blogspot.com/-uJtCbNrBzEc/XJUWQPOSrfI/AAAAAAAABUs/ZlReSwpfI3Ack60629Rv0N8hSrPFHb3TACLcBGAs/s1600/elephant.jpg", "The population of elephants is decreasing in the world."))

        imageList.add(SlideModel(R.drawable.slider_one, null, false))
        imageList.add(SlideModel(R.drawable.slider_two, null, false))
        imageList.add(SlideModel(R.drawable.slider_three, null, false))
        imageList.add(SlideModel(R.drawable.slider_four, null, false))

        val imageSlider = root.findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, false)

        imageSlider.startSliding(3000) // with new period
        imageSlider.startSliding()
        imageSlider.stopSliding()

        /*imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                // You can listen here
            }
        })*/

        return root
    }
}