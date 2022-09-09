 
listView('testupload1112 Jobs') {
    description('testupload1112 Jobs')
    jobs {
        regex('testupload1112_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
