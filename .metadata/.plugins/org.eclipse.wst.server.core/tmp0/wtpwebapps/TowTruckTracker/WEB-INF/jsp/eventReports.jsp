<!doctype html>
<html ng-app>
	<head>
		<title>NG Report</title>
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
		<script type="text/javascript" src="js/events.js"></script>
	</head>
	<body>
		<div ng-controller="Events">
			I have {{events.length}} events!
			
			<ul class="events-container">
				<li ng-repeat="event in events">
					{{event.name}}
				</li>
			</ul>
		</div>
	
	</body>
	
</html>