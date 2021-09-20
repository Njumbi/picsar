package com.example.picsar.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.picsar.R
import com.example.picsar.ui.AdapterListener
import com.example.picsar.ui.adapters.HomeAdapter
import com.example.picsar.ui.data.model.PhotosResponse
import com.example.picsar.ui.data.model.PhotosResponseItem
import com.example.picsar.ui.viewmodel.HomeVM
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_list_photos.*

class HomeFragment : Fragment(), AdapterListener {
    private lateinit var adapter: HomeAdapter
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    private var vm: HomeVM? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vm = ViewModelProvider(this).get(HomeVM::class.java)

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        db = Firebase.firestore
        auth = FirebaseAuth.getInstance()


//        likeListener()

        adapter = HomeAdapter(this)
        rv_photos.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
        rv_photos.adapter = adapter

        funLoadPhotos()
    }

    private fun likeContent() {
        TODO("Not yet implemented")
    }

    private fun unLikeContent() {
        TODO("Not yet implemented")
    }


    private fun isUserLogged(): Boolean {
        return if (auth.currentUser == null) {
            Toast.makeText(
                getContext(), "Login to continue", Toast.LENGTH_SHORT
            ).show()
            false
        } else
            true
    }


//    private fun likeListener() {
//        if (!isUserLogged()) return
//
//        db.collection("favoriteImages")
//            .whereEqualTo("user", auth.currentUser?.uid)
//            .addSnapshotListener { snapshot: QuerySnapshot?, e: FirebaseFirestoreException? ->
//                if (e != null) {
//                    Log.w(ContentValues.TAG, "Listen failed.", e)
//                    return@addSnapshotListener
//                }
//
//                for ( doc in snapshot!! ){
//                    val o = doc.toObject(PhotosResponseItem::class.java)
//                    if (o.id == PhotosResponseItem.){
//                        val mDrawable: Drawable =
//                            this.resources.getDrawable(R.drawable.baseline_favorite_red_500_24dp)
//                        iv_favorite.setImageDrawable(mDrawable)
//                        break
//                    }
//                }
//            };
//    }

    private fun funLoadPhotos() {
        vm?.funLoadPhotos()
        vm?.loadPhotosLiveData?.observe(viewLifecycleOwner, {
            if (it is PhotosResponse) {
                adapter.setData(it)
                adapter.setListener(this@HomeFragment)
            } else {
                Toast.makeText(
                    requireActivity(),
                    it.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

    }

    override fun myListener(data: PhotosResponseItem) {
        Toast.makeText(requireActivity(), "Clicked -> ${data.id}", Toast.LENGTH_SHORT).show()


    }
}
