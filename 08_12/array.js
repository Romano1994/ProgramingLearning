let gardes = {
    "list" : { "egoing": 10, "chan": 20, "gokce": 30},
    "show" : function() {
        for(let name in this.list){
            console.log(name, this.list[name]);
        }
    }
}
gardes.show();