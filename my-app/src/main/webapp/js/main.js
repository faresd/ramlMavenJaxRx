// Models
window.Presentation = Backbone.Model.extend({
    urlRoot: '../rest/presentations'
});

window.PresentationCollection = Backbone.Collection.extend({
    url:"../rest/presentations"
});


// Views
window.AllPresentations = Backbone.View.extend({

    el: '#sidebar',
    render:function () {
        var that = this;
        var presentationsCol = new PresentationCollection();
        presentationsCol.fetch({
            success: function (presentations) {
                alert(JSON.stringify(presentations))
                var dddd = presentations.toJSON()[0].presentations
                var template = _.template($('#tpl-presentation-list-item').html(), {presentations: presentations.toJSON()[0].presentations});
                $(that.$el).html(template);
            }

        })
    }

});

// Router
var AppRouter = Backbone.Router.extend({
    routes:{
        "presentations": "presentations",
    }

});

var presentationList = new AllPresentations();

var router = new AppRouter()
router.on('route:presentations', function () {
    presentationList.render();
})

Backbone.history.start();