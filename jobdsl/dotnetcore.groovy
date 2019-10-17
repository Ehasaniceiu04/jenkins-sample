job('dotnet core job dsl') {
    scm {
        git('https://github.com/Ehasaniceiu04/shorturl.git','master') { 
        }
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        batchFile('dotnet restore')
        batchFile('dotnet build')
        batchFile('dotnet test')
        
    }
}
