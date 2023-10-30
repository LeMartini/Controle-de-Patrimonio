(function(){
    $("#tabimovel").on("click","js.delete", function(){
        let botaoClicado = $(this);
        $("#btnsim").attr("data-id", botaoClicado.attr("data-id"))
        $("#modalbem").modal("show");
    })
    $("#btnsim").on("click", function(){
        let botaoSim = $(this);
        let od = botaoSim.attr("data-id")
        $.ajax({
            url: "/bem/remover/" + id,
            method: "GET",
            success:  function(){
                window.location.href = "/bem"
            }
        })
    })

})();
