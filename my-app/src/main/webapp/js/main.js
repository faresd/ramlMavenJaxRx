// Models
window.Presentation = Backbone.Model.extend();

window.PresentationCollection = Backbone.Collection.extend({
    model:Presentation,
    url:"../rest/presentations"
});


// Views
window.Allpresentations = Backbone.View.extend({

    tagName:'div',

    template:_.template($('#tpl-presentation-list-item').html()),


    initialize:function () {
        this.model.bind("reset", this.render, this);

    },

    render:function (eventName) {
        _.each(this.model.models, function (presentation) {
            var ss = presentation
            alert(JSON.stringify(ss))
            $(this.el).html(this.template(presentation.toJSON()));
        }, this);
        return this;
    }

});

// Router
var AppRouter = Backbone.Router.extend({

    routes:{
        "presentations": "presentations",
    },

    presentations: function () {
        this.presentaionList = new PresentationCollection();
        this.allpresentationView = new Allpresentations({model:this.presentaionList});
        // should find a way to create render based on an event lisener.
        var el = this.allpresentationView.render().el
        this.presentaionList.fetch().then(function() {
            $('#sidebar').html(el);
        });
    }
});


var app = new AppRouter();
Backbone.history.start();