job('dotnet core job dsl') {
    scm {
        git('https://github.com/Ehasaniceiu04/shorturl.git') { 
        }
    }
    
    steps {
        batchFile('dotnet restore')
    }
}
