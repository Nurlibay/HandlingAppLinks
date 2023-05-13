package uz.nurlibaydev.handlingapplinks

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.nurlibaydev.handlingapplinks.databinding.ScreenMainBinding

class HomeScreen: Fragment(R.layout.screen_main) {

    private lateinit var binding: ScreenMainBinding

    /**
     * For instance:
     * https://nurlibay.github.io/id=oqbegnwefwe
     */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ScreenMainBinding.bind(view)

        val newIntent = requireActivity().intent
        val data = newIntent.data

        val id = data.toString().substringAfter("id=")

        binding.tvId.text = id
    }
}