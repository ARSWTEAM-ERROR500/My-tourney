var api = apiclient;
var App = (function () {
    function createTeam(name) {
        api.createTeam({nombre:name});
    }
    return {
        createTeam: createTeam,
    };
})();