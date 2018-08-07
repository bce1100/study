/**
 * Created by bce1100 on 2018/7/17.
 */
$(document).ready(function () {
    //
    // $("#btn1").click(function () {
    //     // $("#p1").text(function (i,ot) {
    //     //     return "old:("+ot+") new:"+(i);
    //     // })
    //     // $("#p1").append("<ul><li>a</li><li>b</li><li>c</li></ul>");
    //     // $("p").remove();
    //     // $("#p1").hide(1000);
    //     $("#p1").toggle(1000);
    // })
    //
    // $("#btn2").click(function () {
    //     $("#p1").show(2000);
    // });
    //
    // // $("#btn2").myjq();
    //
    // $("#fade").click(function () {
    //     $("#d1").fadeToggle(1000);
    //     $("#d2").fadeToggle(1000);
    //     $("#d3").fadeToggle(1000);
    // });
    $(".main>a").click(function () {
        var ulNode = $(this).next("ul");
        ulNode.slideToggle(500);
        changeIcon($(this));
    });

    $(".hmain").hover(function () {
        $(this).children("ul").slideDown();
        changeIcon($(this).children("a"));
    },function () {
        $(this).children("ul").slideUp();
        changeIcon($(this).children("a"));
    });
});

function changeIcon(mainNode) {
    if(mainNode){
        if(mainNode.css("background-image").indexOf("1.png")>=0){
            mainNode.css("background-image","url(2.png)")
        }else{
            mainNode.css("background-image","url(1.png)")
        }
    }
}