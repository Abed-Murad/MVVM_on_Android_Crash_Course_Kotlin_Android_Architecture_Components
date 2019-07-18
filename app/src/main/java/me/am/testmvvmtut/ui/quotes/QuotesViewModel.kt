package me.am.testmvvmtut.ui.quotes

import androidx.lifecycle.ViewModel
import me.am.testmvvmtut.data.Quote
import me.am.testmvvmtut.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)


}