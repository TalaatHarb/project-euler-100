use crate::{Runable, Solvable};

fn days_in_month(month: u32, year: u32) -> u32 {
    match month {
        4 | 6 | 9 | 11 => 30,
        2 => {
            if (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 { 29 } else { 28 }
        }
        _ => 31,
    }
}

pub struct P019;
impl Solvable for P019 {
    fn problem_name(&self) -> &str { "p019" }
    fn solve(&self) -> i64 {
        let mut result = 0i64;
        let mut day = 1u32; // Jan 1 1900 = Monday
        for year in 1900..=2000 {
            for month in 1..=12u32 {
                if year >= 1901 && day == 0 {
                    result += 1;
                }
                day = (day + days_in_month(month, year)) % 7;
            }
        }
        result
    }
}
impl Runable for P019 {}
