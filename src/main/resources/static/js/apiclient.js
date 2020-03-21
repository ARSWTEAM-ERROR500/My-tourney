apiclient = (function() {

    return {
        createTeam:function (team) {
            var postPromise=$.ajax({
                url:"/equipos",
                type:'POST',
                data:JSON.stringify(team),
                contentType: "application/json",
            })
            return postPromise;
        }
    };
})();
