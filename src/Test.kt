import com.toasttab.receipts.LineProtos.Line
import com.toasttab.receipts.ReceiptProtos.Receipt.newBuilder

fun main() {

    val dummyReceiptBuilder = newBuilder()
    dummyReceiptBuilder.apply {
        //order doesn't matter here
        footer = Line.newBuilder().setContent("10 euro").build()
        header = Line.newBuilder().setContent("NBC").build()
        content = Line.newBuilder().setContent("1 Pizza").build()
    }

    val receipt = dummyReceiptBuilder.build()

    //and while printing the receipt..
    receipt.allFields.forEach {
        print(it.value as Line)
    }
}