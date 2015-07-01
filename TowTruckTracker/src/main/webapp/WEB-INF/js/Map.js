var map;

function mapInit() {
	map = new google.maps.Map(document.getElementById('map-canvas'), {
		zoom : 4,
		center : {
			lat : 35.083057973277064,
			lng : -456.3231630859375
		}
	});
}

function mapResetPosition(){
	map.setOptions({
		center: {
		lat : 35.083057973277064,
		lng : -456.3231630859375
	},
	zoom: 4});
}

google.maps.event.addDomListener(window, 'load', mapInit);
