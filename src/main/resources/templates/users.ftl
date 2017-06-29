<html>
<head>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body  ng-app="mySpringBoot_users">
<h1>Hello World</h1>
<div class="container"  ng-controller="AppCtrl_users">
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">Сайты</div>
                <div class="panel-body">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>id</th>
                            <th>email</th>
                            <th>name</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr ng-repeat="item in websites">
                            <th>{{item.id}}</th>
                            <th>{{item.email}}</th>
                            <th>{{item.name}}</th>
                        </tr>
                        </tbody>
                    </table>

                </div>

            </div>
        </div>

    </div>

</div>
<script type="text/javascript" src="js/angular.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
</body>
</html>