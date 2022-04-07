void main()
{

    int var;
    var = 1;

    if (var)
    {
        var = 2;
        if (var)
        {
            printf(1);
        }
        else
        {
            printf(0);
        }
    }
    else if (var >= 2)
    {
        printf(var);
        var = 0;
    }
    else
    {
        var = -1;
        {
            var = 2;
        }
    }

    printf(var);
}