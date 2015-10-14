import collections
from math import factorial

def binomial_coefficient(n, m):
    """
	The binomial coefficient of any two numbers. n must always be larger than m
    :param n: Upper coefficient
    :param m: Lower coefficient
    :returns The number of combinations
    :rtype integer
	"""
	assert n > m
    return factorial(n) / factorial(m) / factorial(n - m)
	
	
def value_units(value):
    """
	Accepts a number and returns it in a named tuple that contains the number converted in
    appropriate units and the unit symbol(e.g. 3214 turns to (3.214, K))
    :param value: The number to be evaluated
    :returns named tuple with number - unit symbol pair
    :rtype namedtuple(number, unit)
    """
    result = collections.namedtuple('value_units', ['value', 'unit'])
    suffix = ''
	suffixes = ['', 'K', 'M', 'B', 'T', 'Q']
	scale = 1.0e3
	for i in xrange(len(suffixes)):
		if abs(value) < scale:
			return result(value, suffix[i])
		value /= scale
		scale *= 1.0e3
		
def days_in_year(year):
    """
	Given a year, return how many days are in that year
	:param year: The year in question
	:returns Number of days in the year
	:rtype Integer
	"""
    start = datetime.date(year, 1, 1)
    end = datetime.date(year, 12, 31)
    return (end - start).days + 1
